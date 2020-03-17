# MongoDB

> ### << 용어 >>
>
> - collection : 테이블
> - document : 레코드
> - field : 컬럼
> - _id : 기본키
>
> 
>
> ### << 명령어 >>
>
> - show dbs
>
> - use mydb
>
> 
>
> ### <<기본작업>>
>
> #### 1. collection(rdbms에서 테이블)을 만들어야 함
>
> - 관계형 DB처럼 스키마를 정의하지 않는다.
>
> - 종류
>
>   - capped collection : 고정사이즈를 주고 생성하는 컬렉션, 미리 지정한 저장공간이 모두 사용되면 맨 처음에 저장된 데이터가 삭제되고 공간으로 활용
>   - non capped collection : 일반적인 컬렉션
>
> - collection 관리
>
>   [생성]
>
>   db.createCollection("컬렉션명", {옵션list})
>
>   => 각각의 옵션을 설정해서 작업(json)
>
>   [삭제]
>
>   db.컬렉션명.drop()
>
>   [이름수정]
>
>   db.컬렉션명.renameColleciont("새컬렉션명")
>
> #### 2. mongodb에 insert
>
> [구문]
>
> - db.컬렉션명.insertOne({데이터...})
> - db.컬렉션명.insertMany({데이터...})
> - db.컬렉션명.insert({데이터...})
> - document(관계형db에서 레코드개념)에 대한 정보는 json의 형식으로 작성
> - mongodb에서 document를 삽입하면 자동으로 _id가 생성 - 기본키의 역할
> - "_id" : ObjectId("5e6ee7bc3eed81598ecebafb") : 현재timestamp + machine Id + mongodb프로세스Id + 순차번호
>
> #### 3. mongodb에 update
>
> - document 수정
> - 조건을 적용해서 수정하기 위한 코드도 json으로 구현
>
> [update를 위한 명령어]
>
> - $set: 해당필드의 값을 변경(업데이트하기위한 핵심 명령어)
> - $inc: 해당필드에 저장된 숫자의 값을 증가
> - $unset : 원하는 필드를 삭제할 수 있다.
>
> [옵션]
>
> - multi => true로 설정하지 않으면 조건에 맞는 document중 첫 번째 document만 update
>
> [구문]
>
> - db.컬렉션명.update({조건필드:값}),      //sql의 update문으로 치면 where절
>
>   ​									{$set{수정할필드:수정값}}
>
> #### 4. mongodb에서 배열 관리
>
> [데이터수정]
>
> - db.score.update({id:"jang"},{$set:{info:{city:["서울","안양"], movie:["겨울왕국2","극한직업","쉬리"]}}})
>
> [배열에서 사용할 수 있는 명령어]
>
> - $addToSet
>   - db.score.update({id:"jang"},{$addToSet:{"info.city":"인천"}})
> - $push
>   - db.score.update({id:"jang"},{$push:{"info.city":"천안"}})
> - $pop
>   - db.score.update({id:"jang"},{$pop:{"info.city":1}})
>   - db.score.update({id:"jang"},{$pop:{"info.city":-1}})
> - $each : addToSet이나 push에서 사용할 수 있다.
>   - 여러 개를 배열에 추가할 때 사용
>   - db.score.update({id:"jang"},{$push:{"info.city":{$each:["천안","가평","군산"]}}})
> - $sort : 정렬(1:오름차순, -1:내림차순)
>   - db.score.update({id:"jang"},{$push:{"info.city":{$each:["천안","가평","군산"],$sort:1}}})
> - $pull
>   - db.score.update({id:"jang"},{$pull:{"info.city":"천안"}})
>     - 천안을 다 지운다.
>   - db.score.update({id:"jang"},{$pull:{"info.city":["가평","군산"]}})
>     - 가평, 군산을 지울 때 이렇게 하면 안된다.
>   - db.score.update({id:"jang"},{$pullAll:{"info.city":["가평","군산"]}})
>     - 이렇게 가야한다.
>
> #### 5. 조회
>
> - find
>
>   - db.컬렉션명.find(조건, 조회할 필드에 대한 명시)
>
>   - 조건, 조회할 필드에 대한 명시 모두 json
>
>   - 조회할 필드의 정보 명시
>
>   - 형식:{필드명:1} => 화면에 표시하고 싶은 필드
>
>     ​		{필드명:0} => 조회된 필드가 화면에 표시되지 않게 명시
>
>   [조건]
>
>   - $lt  : < 
>   - $gt : >
>   - $lte : <= 
>   - $gte : >= 
>   - $in : 하나의 필드에서만 비교
>   - $nin : not in
>     - addr이 인천인 데이터 : id, name, dept, addr
>     - db.score.find({addr:"인천"},{id:1,name:1,dept:1,addr:1}
>   - $not:$exists:null : null이 아닌것만 골라냄
>
> - 메소드
>
>   - findOne() : 첫 번째 document만 리턴
>   - find() : 모든 document 리턴
>   - count() : 행의 갯수를 리턴
>   - sort({필드명:sort옵션})
>   - limit(숫자) : 숫자만큼의 document만 조회
>   - skip(숫자) : 숫자만큼의 document를 skip하고 조회
>
> - 정규표현식을 적용
>
>   - db.컬렉션명.find({조건필드명:/정규표현식/옵션})
>
>   [기호]
>
>   - | : or
>   - ^ : ^뒤의 문자로 시작하는지 체크
>   - [a-i] : a에서 i까지의 모든 영문자
>
>   [옵션]
>
>   - i : 대소문자 구분없이 조회 가능
>     - id가 k-p로 시작하는 document 조회
>     - db.score.find({id:/[k-p]/})
>     - id에 a와 i가 있는 document조회
>     - db.score.find({id:/[ai]/})
>
> #### 6. 삭제 - remove()
>
> - 조건을 정의하는 방법은 find()나 update()에서 했던 내용과 동일
> - db.score.remove({servlet:{$lt:80}})
>
> #### 7. aggregate(mapreduce)
>
> - 특징
>
>   - group by
>   - 간단한 집계를 구하는 경우 mapreduce를 적용하는 것 보다 간단하게 작업할 수 있다.
>   - Pipeline을 내부에서 구현
>   - 한 연산의 결과가 또 다른 연산의 input데이터로 활용
>
> - 1) 명령어(RDBMS와 비교)
>
>   - $match : where절, having절
>   - $group : group by
>     		: {_id:그룹으로 표시할 필드명, 연산결과를 저장할 필드명:{연산함수:값}}
>   - $sort : order by
>   - $avg : avg그룹함수
>   - $sum : sum그룹함수
>   - $max : max그룹함수
>
>   [형식]
>
>   - db.컬렉션명.aggregate(aggregate명령어를 정의)
>     - 여러가지를 적용해야 하는 경우 배열로 
>
> #### 8. 예제
>
> ```
> db.score.update({},{$set:{num:1000}},{multi:true})
> var x = db.score.find()
> while(x.hasnext()){
> 	var one = x.next();
> 	one.num = 1000;
> 	db.score.save(one);
> }
> ```
>
> ```
> 1. Score collection에서 이름과 주소와 servlet점수를 출력해보자
> db.score.find({},{name:1,addr:1,servelt:1})
> 2. Score collection에서 java점수 중 70점 이상을 출력해보자
> db.score.find({java:{$gte:70}})
> 3. Score collection에서 이름, java점수를 출력하고 bonus가 2000이상인 사람만 출력해보자
> db.score.find({bonus:{$gte:2000}},{name:1,java:1})
> 4. score에서 dept가 인사이면서 addr이 안양이거나 대구인 document 출력
> db.score.find({dept:"인사",addr:/안양|대구/})
> 5. servlet이 70에서 90사이이며 dept가 총무인 document 조회
> db.score.find({servlet:{$lt:90},servlet:{$gt:70},dept:"총무"})
> 6. score에서 이름에 김씨인 사람 조회해보기
> db.score.find({name:/^[김]/})
> 7. score에서 servlet점수가 가장 낮은 document와 가장 높은 document 출력하기
> db.score.find({servlet:{$gte:0}}).sort({servlet:1}).limit(1)
> db.score.find().sort({servlet:-1})limit(1)
> 8. java점수가 가장 높은 document중에 7개를 출력하되 2개를 건너뛰고 출력해보자
> db.score.find().sort({java:-1}).skip(2).limit(7)
> 9. 아이디에 n과 o가 들어가는 document 구하기
> db.score.find({[{id:/n/}, {id:/o/}]})﻿
> ```
>
> ```
> 1. dept가 인사인 document의 servlet평균 구하기
> db.score.aggregate([{$match:{dept:"인사"}},{$group:{_id:"$dept",servlet평균:{$avg:"$servlet"}}}]);
> 2. java가 80점이 넘는 사람들의 부서별로 몇 명인지 구하기
> db.score.aggregate([{$match:{java:{$gt:80}}},{$group:{_id:"$dept",인원수:{$sum:1}}}]);
> 3. 2번 결과를 인원수데이터를 내림차순으로 정렬해 보세요.
> db.score.aggregate([{$match:{java:{$gt:80}}},{$group:{_id:"$dept",인원수:{$sum:1}}},{$sort:{인원수:-1}}]);
> ```
>
> ```
> db.score.update({id:"song"},{$push:{"history":{$each:["영업1팀","총무","기획실"]}}})
> db.score.update({id:"jang"},{$push:{"history":{$each:["전략팀","총무","전산"]}}})
> db.score.update({id:"hong"},{$push:{"history":{$each:["영업1팀","기획실","전산"]}}})
> db.score.update({id:"song"},{$push:{"history":"자금부"}})
> db.score.update({id:"jang"},{$pop:{"history":1}})
> db.score.update({servlet:100},{$inc:{bonus:3000}},{upsert: true, multi:true})
> db.score.update({id:"song"},{$addToSet:{"lang.ms":{$each:["visual basic","asp",".net"]}}})
> 
> db.createCollection("board")
> db.board.insert({no:"001",id:"kim",content:"게시글1 내용1",count:10,writedate:"20/03/01"})
> db.board.insert({no:"002",id:"lee",content:"게시글2 내용2",count:20,writedate:"20/03/02"})
> db.board.insert({no:"003",id:"park",content:"게시글3 내용3",count:30,writedate:"20/03/03"})
> db.board.insert({no:"004",id:"jang",content:"게시글4 내용4",count:40,writedate:"20/03/04"})
> db.board.insert({no:"005",id:"song",content:"게시글5 내용5",count:50,writedate:"20/03/05"})
> 
> db.board.update({no:"002"},{$push:{comment:{content:"댓글1 내용1", count1:1, count2:11,writedate:"20/03/10"}}})
> db.board.update({no:"002"},{$push:{"comment":{content:"댓글2 내용2", count1:2, count2:22,writedate:"20/03/11"}}})
> db.board.update({no:"002"},{$push:{"comment":{content:"댓글3 내용3", count1:3, count2:33,writedate:"20/03/12"}}})
> ```
>
> ```
> db.score.find({java:{$gte:90}},{id:1,name:1,dept:1,java:1})
> db.score.find({$or: [{dept:"인사"},{addr:"인천"}] })
> db.score.find({id:{$nin:["song","hong","kang"]} })
> ```
>
> 
>
> 
>
> 
>
> 
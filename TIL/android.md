## Activity

> - 화면이다.
> - Activity A -> Activity B로 넘어갈 때 new해서 넘어가지 않는다. => 컴포넌트 기반

## manifest

> - 모든 파일에 대한 정보는 manifest에 등록이 되어 있어야 한다.
>
> 

## Adapter

> - 리스트 뷰에서 사용되는 말
>   - View : 
>   - data : ArrayList
>   - 디자인 : 사용자 정의 디자인
> - 기본적으로 제공되는 Adapter는 기능이 제한되기 때문에 커스터마이징이 들어가야 한다.
>   - mapreduce보다는 쉬울 것

## Inflator

> - 



## 사용자 정의 Adapter 만들기

> - 안드로이드에서 앱을 구성할 때 목록형식을 가장 많이 사용
> - 사용자 정의로 디자인한 뷰를 목록으로 사용하고 싶은 경우
> - 안드로이드 내부에서 제공하는 Adapter로 표현하고 싶은 내용을 모두 표현할 수 없다.(이벤트연결, 각 목록의 구성을 다르게 생성)
>
> [구성요소]
>
> - Adapter를 이용해서 출력할 데이터를 저장하는 객체(DTO)
> - 사용자정의 Adapter
>   - 안드로이드에서 제공하는 Adapter 클래스를 상속
>     - 리스트뷰를 만들 때 필요한 정보를 저장할 수 있도록 멤버변수 정의(Context, row디자인 리소스, 데이터 등)
>   - 생성자 정의
>     - 상속받고 있는 ArrayAdapter의 생성자 호출
>   - ArrayAdapter에 정의되어 있는 메소드를 오버라이딩
>     - getView : 리스트뷰의 한 항목이 만들어질때마다 호출
>       - 전달된 리소스를 이용해서 뷰를 생성(LayoutInflator)
>       - 한 row를 구성하는 view를 찾아서 데이터와 연결
>   - getView 메소드에서 성능 개선을 위한 코드를 작성
>     - 한 번 생성한 뷰를 재사용
>     - findViewById는 한 번만 찾아오기
>   - ViewHolder 객체를 생성
>     - row를 구성하는 뷰를 findViewById하는 작업을 한번만 수행
>     - row에 대한 구성 View를 멤버번수로 선언
>     - 생성자에서 findViewById처리
>     - 최초로 뷰를 만들 때 (row에 대한 뷰) 이 객체를 생성해서 활용
>   - row를 구성하는 뷰에 상태값을 저장하기
>     - 각 뷰의 이벤트를 통해 저장
>     - 각 뷰의 상태값을 저장할 수 있도록 객체
>       - 상태값을 저장한 객체를 자료구조에 저장
>       - focus를 잃어버릴 때 상태를 저장
> - Adapter를 통해 만들어진 리스트뷰를 보여줄 액티비티
>   - main layout 필요

## Intent

> - 인텐트 객체를 생성하고 실행할 액티비티의 정보와 데이터를 셋팅
>   - 값
>   - 객체
> - 안드로이드 OS에 인텐트객체를 넘기며 의뢰
>   - 액티비티실행
>   - startActivity
> - 인텐트에 설정되어 있는 액티비티 호출
> - 호출된 액티비티에서는 안드로이드 OS가 넘겨준 인텐트를 가져오기
> - 인텐트에 셋팅된 데이터를 꺼내서 활용 

## Permission

> - Permission 종류
>   - 일반
>   - 위험
>   - 사용자정의
>
> - 위험권한
>   - 액티비티를 실행하거나 버튼을 누르거나 어떤 기능을 사용할 때 권한에 대한 처리를 할 수 있도록 구현
>   - 사용메소드
>     - checkSelfPermission : 퍼미션의 현재 상태를 확인하는 메소드
>     - requestPermission : 권한이 체크되어 있지 않은 경우에 권한을 요청하는 메시지를 표시
>     - requestPermissionsResult : requestPermission의 결과로 호출되는 메소드, premission 설정 정보를 매개변수로 넘긴다.
>       - requestCode : 퍼미션 요청할 때 넘긴 요청코드
>       - premissions : 요청퍼미션 목록
>       - grantResults : 퍼미션 설정 결과
>   - 처리 순서
>     - 현재 사용하려고 하는 권한이 설정되어 있는지 체크
>       - checkSelfPermission 를 이용
>     - 1번에서 리턴값이 PERMISSION_DENIED인 경우 사용자가 권한을 설정할 수 있도록 메시지를 표시
>       - requestPermissions
>     - 요청 처리 후 자동으로 호출되는 메소드를 통해 다음에 어떤 처리를 할 것인지 정의
>       - 권한 성공 => 기능이 실행되도록
>       - 권한 실패 => Preference를 통해 설정할 수 있도록 액티비티를 이동하거나 안내 메시지를 출력

## DB

>- 내부DB에 저장할 건지 서버에 저장할 건지 결정을 해야한다.
>- 앱을 지웠을 때 같이 사라지게 하려면 내부에, 남아있어야 하면 서버에 저장되어야 한다.
>
>- SQLite의 컬럼타입
>  - text, varchar
>  - smallint, integer
>  - real, float, double
>  - boolean
>  - date, time, timestamp
>  - blob, binary
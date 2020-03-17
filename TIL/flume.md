flume

-> 데이터를 추출하기 위해 사용되는 프로그램

시스템로그, 웹 서버의 로그, 클릭로그, 보안로그.. 비정형데이터를 HDFS에 적재하기 위해 사용하는 프로그램

대규모의 로그데이터가 발생하면 효율적으로 관리

flume, chukwa, scribe, fluentd, splunk



[설정]

1. 다운로드(압축풀기)
2. .bashrc에 설정 정보 등록
3. flume-env.sh rename하고 정보등록
   - jdk홈디렉토리
   - hadoop홈디렉토리
4. flume 설정 파일에 등록
   - flume-conf.properties.template을 rename해서 XXXX.properties
   - flume agent의 source,channel,sink에 대한 정보를 등록



[Flume의 구성요소]

flume의 실행 중인 프로세스를 agent라 부르며 source, channel, sink로 구성

1. source

   => 데이터가 유입되는 지점(어떤 방식으로 데이터가 유입되는지 type으로 명시)

   1) type

   - netcat : telnet을 통해서 
   - spoolDir

2. channel

   => 데이터를 보관하는 곳(source와 sink 사이의 Queue)

3. sink

   => 데이터를 내보내는 곳(어떤 방식으로 내보낼지 정의)

   1) type

    - logger : flume서버 콘솔에 출력이 전달
      	- flume을 실행할때 -Dflume.root.logger=INFO,console를 추가
   - file_roll : file을 읽어서 가져오는 경우
     - directory : 읽어온 파일을 저장할 output폴더를 명시
   - hdfs



[flume의 실행]

```bash
[hadoop@hadoop01 apache-flume-1.6.0-bin] ./bin/flume-ng agent --conf conf --conf-file ./conf/console.properties --name myConsole -Dflume.root.logger=INFO,console

[hadoop@hadoop01 apache-flume-1.6.0-bin] ./bin/flume-ng agent -c conf -f ./conf/myfolder.properties -n myConsole

[hadoop@hadoop01 apache-flume-1.6.0-bin] ./bin/flume-ng agent -c ./conf/ -f ./conf/hdfs.properties -n myhdfs
```

실행명령어: ./bin/flume-ng agent

–conf : 설정파일이 저장된 폴더명

–conf-file : 설정파일명

–name : agent의 이름




vmware설치

​	머신생성 - centos7exescp





머신복제

​	ip확인

머신4대 클러스터링

​	방화벽해제

​		- systemctl stop firewalld

​	hostname변경

​	domain등록

  * hosts파일 등록

  * 네트워크 프로세스를 restart

  * 네 대에 모두 적용되도록

    [원격서버로 파일 복사]

    scp copy할파일(위치까지명시) copy받을 서버의 위치

    scp /etc/hosts root@hadoop02:etc/hosts

 [원격서버에 실행명령]

ssh서버 "실행할 명령문"



- 암호화된 통신을 위해서 공개키 생성 후 배포
  - ssh-keygen -t ras
  - cd .ssh
  - ssh-copy-id -i id_rsa.pub hadoop@hadoop03
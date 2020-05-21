# 한국경영원 인재개발원 자바 파이썬 과정

## 2020년 5월 14일 부터 

### 프로그래밍 언어 활용 - 자바프로그래밍

* git repository 사용법 익히기
* 문서를 작성할때는 vi 에디터를 사용한다.
* vi 파일이름으로 명령을 입력하면, 파일이 없으면 새로만들고 파일이 있으면
파일을 열어서 편집할 수 있다.

#### vi 에디터의 편집모드(Editiong mode)
* vi 에디터를 실행한 후 내용을 입력, 추가, 삭제를 하려면 에디터를 편집모드로
변경해주어야 하는데 이때 눌러야 하는 키가 영문 소문자 i 키다.
* vi 에디터가 실행된 직후에는 명령모드(Command mode)로서 내용을 입력, 추가, 삭제 할수 없다.
* 뭔가 내용을 입력해야 하는데 화면이 깜빡거리면서 입력이 안되는 경우 vi 에디터가
명령모드인 상태이므로 영문 소문자 i를 눌러서 편집모드로 변경 해 주어야 한다.

#### vi 에디터의 명령모드(Command mode)
* 내용을 편집( 입력, 추가, 삭제)한 후에는 저장을 하거나, 또는 저장을 취소하거나 vi 에디터를 종료해야 하는데 이때는 편집모드에서 명령모드로 다시 변경을 해주어야 한다.
* 편집모드에서 명령모드로 변경을 하고자 할때는 아무때나 ESC키를 눌러주면 된다.
상태에따라 한번에 ESC키로 변경이 안되는 경우도 있다.
이때는 ESC키를 2-3번 눌러주면 된다.

* vi 에디터에서 명령을 실행하려면 명령문 입력전에 콜론(:)을 먼저 입력한다.

* vi 에디터에 주요 명령들
가. :w = 편집된 내용을 파일에 저장하기
나. :q = vi 에디터를종료하기
다. :wq = 편집된 내용을 파일에 저장하고, vi 에디터를 종료하기
* 라. vi 에디터가 종료가 안되는 경우
가. 편집모드에서 내용을 편집한 상태로 명령모드로 변경한 다음 :q 를
입력하면 vi 에디터는 종료를 거부한다.
나. :q! =  편집내용을 버리고 (무시하고) 무조건 vi 에디터를 종료하기

* vi 에디터의 편집키(명령모드에서)
가. dd = 현재 커서가 있는 한줄을 통째로 삭제
나. del키 = 현재 커서가 있는뒤쪽 한글자를 삭제하기
다. x  = 현재 커서가 있는 뒤쪽 한글자를 삭제하기


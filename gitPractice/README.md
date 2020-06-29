# gitPractice
이 프로젝트는 Local directory와 remote Repository사이의 연동과, git을 통한 버전의 생성과 관리를 연습하기 위해 제작되었습니다.</br>

## Getting Start
**step 1 - Github**</br>
깃허브에서 로그인하세요</br>

**step 2 - Repository 생성**</br>
gitPractice를 다룰 repository를 하나 생성하세요</br>

**step 3 - Download gitPractice**</br>
다운로드합니다</br>

**step 4 - Push it**</br>
마음대로 수정하신 후 commit / push 할 수 있습니다.
</br>
```
&git add -all
&git commit -m "버전 번호"
&git push -u origin master /*단 해당 명령어는 최초 1회 push시에만 입력합니다.*/

&git push /*최초 push 이후부터의 push 명령어*/
```








> ver 0.1<br/>
버전정보를 추가하였습니다.
<hr/>
> ver 0.2<br/>
> git 연습도중 발생한 실수 : 작업중인 Head포인터를 임의로 변경(reset)하여 push에 오류가 발생하였습니다.
> solution : &git pull 명령어로 working copy에 remote Repository를 merge 시켜서 동기화하였습니다.
<hr/>
> ver 1.0.0<br/>
> tag를 이용하여 최초로 release 하였습니다.
<hr/>
> ver 1.0.2<br/>
> merge와 rebase를 학습하였습니다.

# 마크다운 기초

## 1. 제목(Heading)

제목은 # 으로 표시된다. 제목 레벨은 6단계 까지 있다.

### h3 제목

#### h4 제목

##### h5 제목

###### h6 제목

## 2. 목록

	1. 순서가 있는 목록
 	2. 순서가 있는 목록
      	1. enter+탭을 통해 레벨 다운

* 순서가 없는 목록*

  * 순서가 없는 목록

  * 순서가 없는 목록

## 3. 링크

[마크다운 설명서](https://guides.github.com/features/mastering-markdown/)

### 4. 이미지

![1](images/KakaoTalk_Moim_4UjmLsR1AohJhEmSqqNZkX7uHKU0kp.jpg)

![1](images/KakaoTalk_Moim_4UjmLsR1AohJhEmSqqNZkX7uHKU0kp.jpg)

* typora에서 이미지를 편하게 활용하기 위해서는 추가 설정이 필요하다.
* 아래의 옵션을 모두 체크
  * 로컬 이미지에 해당 규칙
  * 온라인 이미지에 해당 규칙
  * 가능하다면 상대 경로
* 폴더 저장 경로를 custom으로 설정
  * ./images

## 5. 인용문(quote)

>  인용문은 > 를 활용한다.

## 6. 표

| 1| 2|
| ---- | ---- |
| 3    | 4    |



## 7. 코드

코드 block을 설정하면, 해당 언어에 대한 syntax hightlighting이 된다.

```python
# 파이썬 주석
print('hi')

```

```c++
#include<iostream>
using namespace std;
int main()
{
    cout << "hello" << endl;
}
```

## 8. 기타

수평선 ---

---

*이탤릭체(기울임체)*

**볼드체**

~~취소선~~




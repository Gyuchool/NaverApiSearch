# NaverApiSearch
[![Build Status](https://travis-ci.com/Gyuchool/NaverApiSearch.svg?branch=main)](https://travis-ci.com/Gyuchool/NaverApiSearch)

## springboot+mysql+naverapi 이용해보기
Naver Api를 이용하여 제품들을 검색 후, 최저가를 설정하면 그때 '모아보기'창에 등장하여 구매 가능 링크로 넘어가지는 기능

## aws ec2를 이용한 배포 성공적 (Ip: http://52.78.203.79/ )(도메인 구입(가비아)은 비싸서 다음에..)
![image](https://user-images.githubusercontent.com/60054318/126054268-cf43c2a7-d84f-4910-935a-ce5ed0b73e96.png)

## 회원관리 기능 API
|      Name      | tag |Request| Response|
| :-----------: | :----: | :---------------: |:---------------: |
| 회원가입 |  GET /user/signup  | - | 회원가입 HTML |
| " | POST /user/signup | 회원가입에 필요한 정보 | - |
| 회원 로그인 | GET /user/login | - | 회원 로그인 HTML|
| " | POST /user/login | 아이디, 패스워드 | - |
| 회원 로그아웃 | GET /user/logout | - | - |

## 상품 등록 및 조회 API 설계
|      Name      | tag | DESCRIPTION |
| :-----------: | :----: | :---------------: |
| 상품 등록 (회원별) |  POST /api/products  |  로그인되어 있는 회원 별로 상품 등록 | 
| 상품 조회 (회원별) | GET /api/products | 로그인되어 있는 회원이 등록한 상품만 조회|
| 상품 조회 (관리자용) | GET /api/admin/products | 모든 회원의 상품 조회 |


## 검색한 결과들을 모아보는 화면
![image](https://user-images.githubusercontent.com/60054318/126171635-36d89476-7bd7-4c8f-b781-ecc3cf6e8423.png)

## 아이맥을 검색하여 결과가 나오고 담아두기 버튼으로 물건을 담아둘수 있다.
![image](https://user-images.githubusercontent.com/60054318/126171987-66aeb3a0-d7e4-4263-af2d-82dc1c919894.png)


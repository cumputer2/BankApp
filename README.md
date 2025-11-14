## 프로젝트 구조

server : 백엔드

- service : 메인 비즈니스 로직
- network : 클라이언트와 통신을 담당
- repository : db CRUD를 담당

client : 프론트엔드(role에 따라 user, manager분리)

- user
- manager

common : 클래스 정의

- Customer
- Account

## 기능 명세서

server

- 유저 생성 - 스레드
- 계좌 생성 - 스레드
- 로그인
- 조회
- 입금 - 스레드
- 출금 - 스레드

client

- customer
    - 로그인
    - 로그아웃
    - 조회
    - 입금
    - 출금
- manager
    - 유저 생성
    - 계좌 생성

## class

- User
    
    field : name, id, password, role
    
    - Customer
        
        field : AccountList[]
        
        method
        
    - Manager
        
        field : 
        
- Account :

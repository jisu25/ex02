-- 계정 추가 및 권한 부여

-- 접속자 확인
SELECT USER FROM DUAL;

-- 계정 생성
DROP USER book_ex CASCADE;
CREATE USER book_ex IDENTIFIED BY rootroot;

-- 권한 추가
GRANT CONNECT, RESOURCE, CREATE SYNONYM, CREATE VIEW
TO book_ex;

-- 계정 확인
SELECT *
FROM DBA_USERS
WHERE USERNAME = 'book_ex';
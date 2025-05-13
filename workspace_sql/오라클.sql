 sal*12+comm, as s2
  select ename, sal*12+comm, 's s', from emp;

-- sal 컬럼을 기준으로 오름차순 - 작은 것 부터 큰 것 순서로

select * from emp
order by sal asc

/* --한 줄주석


/* 범위주석  */

/*
  여러줄 주석
*/
-- SQL  :   Structured Query Languagese
select * from emp order by sal desc;


select * from emp; 

select * from emp;

select * from salgrade;

select empno, ename, deptno from emp;
-- 이름과 급여만 

select sal, ename, 123, 'g' from emp;
select deptno from emp;

select /*distinct*/ job, deptno 
from emp;
--미리
select sal 월급, sal*10 "연 봉" from emp;

-- sal 컬럼을 기준으로 오름차순 - 작은 것 부터 큰 것 순서로
select * from emp order by sal;


--sal 컬럼 기준으로 내림차순 - 큰 것부터
select * from emp order by sal asc;

select * from emp order by sal desc;

select * from emp order by



selct * from emp order by deptno asc, sal desc



select * from emp 
order by deptno desc, sal asc, empno desc; 

-- 부서번호로 오름차순, 겹치면 sal 내림차순




-- deptno asc, sal

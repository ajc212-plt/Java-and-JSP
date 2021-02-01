create table AhnJongCan(
	name varchar2(20)
)

insert into AhnJongCan values('¾ÈÁ¾Âù');

select * from AHNJONGCAN

select * from board

delete from board where seq = 1
delete from board where seq = 2
delete from board where seq = 3;
delete from board where seq = 4;
delete from board where seq = 5;
delete from board where seq = 6;
delete from board where seq = 7;
delete from board where seq = 8;

create table springtest(
	id varchar2(20),
	name varchar2(20),
	joindate date default sysdate
);

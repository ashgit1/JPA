--<ScriptOptions statementTerminator=";"/>
create table APP.derbyDB(num int, addr varchar(40));
insert into APP.derbyDB values (1956,'Webster St.');
insert into APP.derbyDB values (1910,'Union St.');
update APP.derbyDB set num=180, addr='Grand Ave.' where num=1956;
select * from APP.derbyDb;


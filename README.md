# spring-boot-employee-project
spring-boot-employee-project

## Create data in database

### Creating database table

```
create table employee(
EMPNO int,
ENAME varchar(10),
JOB varchar(10),
HIREDATE date,
MGR int,
SAL int,
COMM int,
DEPTNO int);
```

### Updating primary key
```
ALTER TABLE employee ADD PRIMARY KEY (EMPNO)
```

### Inserting values to table

```
insert into employee values
(7369, 'SMITH', 'CLARK', '23-MAY-82', 7902, 800, null, 20);
insert into employee values
(7499, 'ALLEN', 'SALESMAN', '20-FEB-81', 7698, 1600, 300, 30);
insert into employee values
(7521, 'WARD', 'SALESMAN', '02-APR-81', 7698, 1250, 500, 30);
insert into employee values
(7566, 'JONES', 'MANAGER', '28-SEP-81', 7839, 2975, null, 20);
insert into employee values
(7654, 'MARTIN', 'SALESMAN', '09-JUN-81', 7698, 1250, 1400, 30);
insert into employee values
(7698, 'BLAKE', 'MANAGER', '08-SEP-81', 7839, 2850, null, 30);
insert into employee values
(7782, 'SCOTT', 'CLARK', '23-MAY-87', 7566, 900, null, 20);
insert into employee values
(7839, 'KING', 'PRESIDENT', '17-NOV-81', null, 5000, null, 10);
```


### Listing employee data

```
select * from employee;
```

## Web service response

### url: ``` http://localhost:2023/employee/all ```

```

[
    {
        "empno": 7369,
        "ename": "SMITH",
        "job": "CLARK",
        "hiredate": "1982-05-23T07:00:00.000+00:00",
        "mgr": 7902,
        "sal": 800,
        "comm": null,
        "deptno": 20
    },
    {
        "empno": 7499,
        "ename": "ALLEN",
        "job": "SALESMAN",
        "hiredate": "1981-02-20T08:00:00.000+00:00",
        "mgr": 7698,
        "sal": 1600,
        "comm": 300,
        "deptno": 30
    },
    {
        "empno": 7521,
        "ename": "WARD",
        "job": "SALESMAN",
        "hiredate": "1981-04-02T08:00:00.000+00:00",
        "mgr": 7698,
        "sal": 1250,
        "comm": 500,
        "deptno": 30
    },
    {
        "empno": 7566,
        "ename": "JONES",
        "job": "MANAGER",
        "hiredate": "1981-09-28T07:00:00.000+00:00",
        "mgr": 7839,
        "sal": 2975,
        "comm": null,
        "deptno": 20
    },
    {
        "empno": 7654,
        "ename": "MARTIN",
        "job": "SALESMAN",
        "hiredate": "1981-06-09T07:00:00.000+00:00",
        "mgr": 7698,
        "sal": 1250,
        "comm": 1400,
        "deptno": 30
    },
    {
        "empno": 7698,
        "ename": "BLAKE",
        "job": "MANAGER",
        "hiredate": "1981-09-08T07:00:00.000+00:00",
        "mgr": 7839,
        "sal": 2850,
        "comm": null,
        "deptno": 30
    },
    {
        "empno": 7782,
        "ename": "SCOTT",
        "job": "CLARK",
        "hiredate": "1987-05-23T07:00:00.000+00:00",
        "mgr": 7566,
        "sal": 900,
        "comm": null,
        "deptno": 20
    },
    {
        "empno": 7839,
        "ename": "KING",
        "job": "PRESIDENT",
        "hiredate": "1981-11-17T08:00:00.000+00:00",
        "mgr": null,
        "sal": 5000,
        "comm": null,
        "deptno": 10
    }
]

```

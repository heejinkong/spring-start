실제 Entity 등은 만들지 않고, Redis에 데이터만 저장

```
-- Redis의 문자열은 저장된 데이터가 정수라면
-- INCR, DECR 등으로 값을 쉽게 조정할 수 있다.
-- 추가로 존재하지 않는 데이터에 대해서 실행할 경우 0으로 초기화한다.
INCR articles:{id}

-- 만약 날짜가 바뀔때 데이터를 저장하고 싶다면,
-- Key를 articles:{id}:today 등으로 만들고
INCR articles:{id}:today

-- 날짜가 바뀌는 시점에 RENAME으로 해당 날짜를 기록하면 된다.
RENAME articles:{id}:tody articles:{id}:20XX-XX-XX

```
# springBoot_001

1. 컨트롤러 
2. spring data jpa => jpa => jdbc => 드라이버 => DB
3. And	findBySubjectAndContent(String subject, String content)	여러 컬럼을 and 로 검색
   Or	findBySubjectOrContent(String subject, String content)	여러 컬럼을 or 로 검색
   Between	findByCreateDateBetween(LocalDateTime fromDate, LocalDateTime toDate)	컬럼을 between으로 검색
   LessThan	findByIdLessThan(Integer id)	작은 항목 검색
   GreaterThanEqual	findByIdGraterThanEqual(Integer id)	크거나 같은 항목 검색
   Like	findBySubjectLike(String subject)	like 검색
   In	findBySubjectIn(String[] subjects)	여러 값중에 하나인 항목 검색
   OrderBy	findBySubjectOrderByCreateDateAsc(String subject)	검색 결과를 정렬하여 전달
4. 
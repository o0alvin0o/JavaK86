-- 1. Tìm kiếm các laptop có ram từ 4GB đến 8GB (Bao gồm cả 2 giá trị này)
select * from store.laptop where cast(rtrim(ram,'GB') as INTEGER) between 4 and 8;

-- 2. Tìm kiếm các laptop có ram=8GB, ssd=256GB
select * from store.laptop where ram = '8GB' and ssd = '256GB';

-- 3. Tìm kiếm các laptop có maker chứa ký tự "a"
-- use similar to
select * from store.laptop where maker similar to '%(A|a)%';
-- or like
select * from store.laptop where lower(maker) like '%a%';

-- 4. Tìm kiếm các laptop có cpu là Intel
-- Not sure it always start with Intel in the future
select * from store.laptop where cpu like '%Intel%';

-- 5. Tìm kiếm các laptop có sold > 30 và sắp xếp các laptop theo giá giảm dần.
select * from store.laptop where sold > 30 order by price desc;


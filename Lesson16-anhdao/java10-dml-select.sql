-- 17. Tìm mặt hàng có giá bán cao nhất trong loại hàng 'Giày'
SELECT *
FROM mathang
WHERE TenMH like '%Giày%'
ORDER BY GiaBan DESC
LIMIT 1;

-- 18. Tìm mặt hàng có giá bán cao nhất của mỗi loại hàng
SELECT lh.*,
		mh.TenMH,
       max(mh.GiaBan) GiaBanCaoNhat
FROM mathang mh
join loaihang lh
on mh.MaLoai = lh.MaLoai
group by  mh.MaLoai;

-- 19. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống
SELECT lh.*,
       sum(kcmh.Soluong) TongSoluong
FROM mathang mh
join loaihang lh
on mh.MaLoai = lh.MaLoai
join kichcomathang kcmh
on mh.MaMH = kcmh.MaMH
group by  mh.MaLoai;

-- 20. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống
--     Điều kiện tổng số lượng > 20 mặt hàng
SELECT lh.*,
       sum(kcmh.Soluong) TôngSoluong
FROM mathang mh
join loaihang lh
on mh.MaLoai = lh.MaLoai
join kichcomathang kcmh
on mh.MaMH = kcmh.MaMH
group by  mh.MaLoai
having sum(kcmh.Soluong) >20;

-- 21. Hiển thị mặt hàng có số lượng nhiều nhất trong mỗi loại hàng
select lh.*,
		mh.TenMH,
		max(kcmh.Soluong) SoluongMatHangLonNhat
from mathang mh
join loaihang lh
on mh.MaLoai = lh.MaLoai
join kichcomathang kcmh
on kcmh.MaMH = mh.MaMH
group by lh.MaLoai;

-- 22. Hiển thị giá bán trung bình của mỗi loại hàng
select lh.*,
		avg (mh.GiaBan) GiaBanTBMoiLoai
from mathang mh
join loaihang lh
on mh.MaLoai = lh.MaLoai
group by lh.MaLoai;
SELECT *
FROM mathang;
SELECT *
FROM kichcomathang;
-- 23. In ra 3 loại hàng có số lượng hàng còn lại nhiều nhất ở thời điểm hiện tại
select lh.*,
		sum(kcmh.Soluong) SLHangConLai
from mathang mh
join loaihang lh
on mh.MaLoai = lh.MaLoai
join kichcomathang kcmh
on kcmh.MaMH = mh.MaMH
group by lh.MaLoai
order by sum(kcmh.Soluong) desc
 limit 3;
-- 24. Liệt kê những mặt hàng có MaLoai = 2 và thuộc đơn hàng 1
select mh.TenMH,
	mh.MaLoai,
    ctdh.MaDH
from mathang mh
join chitietdonhang ctdh
on ctdh.MaMH = mh.MaMH
where mh.MaLoai=2 and ctdh.MaDH=1;

-- 25. Tìm những mặt hàng có Mã Loại = 2 và đã được bán trong ngày 28/11
select mh.TenMH,
	mh.MaLoai,
    ctdh.MaDH
from mathang mh
join chitietdonhang ctdh
on ctdh.MaMH = mh.MaMH
join donhang dh
on dh.MaDH = ctdh.MaDH
where mh.MaLoai=2 and month(dh.ThoiGianDatHang)=11 and day(dh.ThoiGianDatHang)=28;

-- 26. Liệt kê những mặt hàng là 'Mũ' không bán được trong ngày 14/02/2019
select mh.TenMH,
	mh.MaLoai,
    ctdh.MaDH
from mathang mh
join chitietdonhang ctdh
on ctdh.MaMH = mh.MaMH
join donhang dh
on dh.MaDH = ctdh.MaDH
where mh.TenMH like '%Mũ%' and cast(dh.ThoiGianDatHang as date) !='2019-02-14';
-- 27. Cập nhật giá bán của tất cả các mặt hàng thuộc loại hàng 'Áo' thành 199
update mathang 
set GiaBan = 199 
WHERE maloai 
      in (select maloai from loaihang
where tenloai='Áo');
select *
from mathang;
-- 28. Backup data. Tạo table LoaiHang_BACKUP(MaLoai, TenLoai)
--     Sao chép dữ liệu từ bảng LoaiHang sang LoaiHang_BACKUP
create table LoaiHang_BACKUP
(Maloai int(45) not null primary key ,
TenLoai varchar(255) not null
);
INSERT INTO loaihang_backup SELECT * FROM loaihang;
SELECT * from loaihang_backup;

-- 29. Tìm những mặt hàng có Mã Loại = 2 (T-Shirt) và đã được bán trong ngày 23/11
select mh.TenMH,
	mh.MaLoai,
    ctdh.MaDH
from mathang mh
join chitietdonhang ctdh
on ctdh.MaMH = mh.MaMH
join donhang dh
on dh.MaDH = ctdh.MaDH
where mh.MaLoai=2 and month(dh.ThoiGianDatHang)=11 and day(dh.ThoiGianDatHang)=23;
-- 30. Liệt kê 2 sản phẩm (có số lượng tồn kho nhiều nhất) của loại hàng 'Áo' và 'Quần'

-- 31. Tính tổng tiền cho đơn hàng 02
--     Với tổng tiền được tính bằng tổng các sản phẩm và số lượng của sản phẩm tương ứng
select dh.MaDH, 
     SUM(mh.GiaBan *ctdh.SoLuong)  TongTien
from donhang dh
join chitietdonhang ctdh
on dh.MaDH=ctdh.MaDH
join  mathang mh 
on  mh.MaMH=ctdh.MaMH
WHERE  dh.MaDH=2;

-- 32. Xuất thông tin hóa đơn của đơn hàng 02 với thông tin như sau.
-- 	SoDH ChiTietDonHang           TongTien
--     02   TenMH:GiaBan:SoLuong     100
select dh.MaDH,
		
        group_concat( mh.TenMH , mh.GiaBan, ctdh.SoLuong  ) ChitietDonHang,
     SUM(mh.GiaBan *ctdh.SoLuong)  TongTien
from donhang dh
join chitietdonhang ctdh
on dh.MaDH=ctdh.MaDH
join  mathang mh 
on  mh.MaMH=ctdh.MaMH
WHERE  dh.MaDH=2;

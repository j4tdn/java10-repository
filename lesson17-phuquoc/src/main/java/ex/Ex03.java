package ex;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.HangTonKho;
import connection.DbConnection;

public class Ex03 {
	
	private static Connection connection = DbConnection.getConnection();

	public static void main(String[] args) {
		
		System.out.println("Thống kê số lượng hàng tồn kho của mỗi loại hàng");
		List<HangTonKho> statistics = statistics();
		utils.Util.print(statistics);
	}

	private static List<HangTonKho> statistics() {
		List<HangTonKho> listsStatistics = new ArrayList<>();
		try {
			Statement statement = connection.createStatement();
			ResultSet resultset = statement
					.executeQuery("select lh.*,group_concat(concat(mh.TenMH,':',kcmh.SoLuong) separator ', ') as MatHangSoLuong,"
							+ "	sum(kcmh.SoLuong) as TongSoLuong" + " from MatHang mh" + " join LoaiHang lh "
							+ "	on mh.MaLoai = lh.MaLoai " + "join KichCoMatHang kcmh " + " on mh.MaMH = kcmh.MaMH "
							+ " group by lh.MaLoai;");
			while (resultset.next()) {
				HangTonKho Items = new HangTonKho(resultset.getInt("maloai"), resultset.getString("tenloai"),
						resultset.getString("MatHangSoLuong"), resultset.getInt("tongSoLuong"));
				listsStatistics.add(Items);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listsStatistics;
	}
}
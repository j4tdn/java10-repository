package service;

import java.util.List;

import dao.HangTonKhoDao;
import persistence.HangTonKho;

public class HangTonKhoService {
	private HangTonKhoDao hangTonKhoDao;

	public HangTonKhoService() {
		hangTonKhoDao = new HangTonKhoDao();
	}
	public List<HangTonKho> getAll(){
		return hangTonKhoDao.getAll();
	}
	
}
package onthiclient3.service;

import java.util.List;

import onthiclient3.entity.TacPham;

public interface ITacPhamService {
	List<TacPham> getAll();
	TacPham getById(int id);
	List<TacPham> getByTacGia(int maTG);
	void add(TacPham tacPham);
	void updateTG(TacPham tacPham);
	void delete(int id);
}

package onthiserver3.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import onthiserver3.entity.TacGia;
import onthiserver3.repository.TacGiaRepository;

@RestController
@RequestMapping("/tacgia")
public class TacGiaRestTemplate {
	
	@Autowired
	private TacGiaRepository tacGiaRepository;
	
	@GetMapping
	public List<TacGia> getAll() {
		return tacGiaRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public TacGia getTacGia(@PathVariable int id) {
		return tacGiaRepository.findById(id).get();
	}
	@PostMapping()
	public TacGia postTacGia(@RequestBody TacGia tacGia) {
		return tacGiaRepository.save(tacGia);
	}
	
	
}

package br.com.project_abcel.abcel.access.services;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;
import static org.springframework.http.HttpStatus.OK;

import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

import br.com.project_abcel.abcel.access.utils.ClassInstanceHelper;

public class PostService<T, D> {
	private Class<T> type;

	public PostService(Class<T> type) {
		this.type = type;
	}

	public ResponseEntity<Object> post(D objDto, JpaRepository<T, UUID> r) {
		try (var cih = new ClassInstanceHelper<T>(type)) {
			var obj = cih.createInstance();
			BeanUtils.copyProperties(objDto, obj);
			return ResponseEntity.status(OK).body(r.save(obj));
		} catch (Exception e) {
			return ResponseEntity.status(INTERNAL_SERVER_ERROR).body(e);
		}
	}
}
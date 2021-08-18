package edu.app.repository;

import edu.app.entity.IEntity;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.io.Serializable;

@NoRepositoryBean
public interface BaseRepository<E extends IEntity, ID extends Serializable> extends PagingAndSortingRepository<E, ID> {
}

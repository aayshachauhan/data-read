package com.zee.data.dataread.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zee.data.dataread.entity.SubOrderEntity;

@Repository
public interface SubOrderRepo extends JpaRepository<SubOrderEntity, Long> {

	public Page<SubOrderEntity> findByPstDataFlagIsNull(PageRequest pagination);

}

package com.trustang.ecommercemarketplace.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trustang.ecommercemarketplace.entity.PendingAds;

public interface PendingAdsRepository extends JpaRepository<PendingAds, Long> {

}

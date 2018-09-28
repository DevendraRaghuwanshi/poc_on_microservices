/**
 * 
 */
package com.demo.microservices.currencyexchangeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.microservices.currencyexchangeservice.bean.ExchangeValue;

/**
 * @author draghuwanshi
 *
 */

public interface ExchnageValueRepository extends JpaRepository<ExchangeValue, Long> {

	public ExchangeValue findByFromAndTo(String from, String to);
}

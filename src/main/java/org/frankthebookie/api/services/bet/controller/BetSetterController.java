/*
 *
 *  * Copyright 2019-2020 the original author or authors.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      https://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package org.frankthebookie.api.services.bet.controller;

import java.util.Collection;
import java.util.UUID;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import org.frankthebookie.api.services.bet.exception.BetNotFoundException;
import org.frankthebookie.api.services.bet.model.Bet;
import org.frankthebookie.api.services.bet.repository.BetRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Bet controller.
 */
@RestController
@RequestMapping("/api/bet")
public class BetSetterController {


private static final Logger LOGGER = LoggerFactory.getLogger(BetSetterController.class);

	/**
	 * The Repository.
	 */
	@Autowired
	private final BetRepository repository;

	/**
	 * Instantiates a new Bet controller.
	 *
	 * @param repository the repository
	 */
	public BetSetterController(BetRepository repository) {
		this.repository = repository;
	}

	/**
	 * Find by id bet.
	 *
	 * @param id the id
	 * @return the bet
	 */
	@GetMapping("/{id}")
	public Bet findBetById(@PathVariable UUID id) {
		return repository.findById(id)
				.orElseThrow(() -> new BetNotFoundException());
	}

	/**
	 * Find bets collection.
	 *
	 * @return the collection
	 */
	@GetMapping("/")
	public Collection<Bet> findBets() {
		return repository.getBets();
	}

	/**
	 * Update bet bet.
	 *
	 * @param id   the id
	 * @param bet the bet
	 * @return the bet
	 */
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Bet updateBet(@PathVariable("id") final String id, @RequestBody final Bet bet) {
		return bet;
	}

	/**
	 * Patch bet bet.
	 *
	 * @param id   the id
	 * @param bet the bet
	 * @return the bet
	 */
	@PatchMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Bet patchBet(@PathVariable("id") final String id, @RequestBody final Bet bet) {
		return bet;
	}

	/**
	 * Post bet bet.
	 *
	 * @param bet the bet
	 * @return the bet
	 */
	@PostMapping("/")
	@ResponseStatus(HttpStatus.CREATED)
	public Bet postBet(@NotNull @Valid @RequestBody Bet bet) {
		LOGGER.info("Bet add: {}", bet);
		repository.add(bet);
		return bet;

	}

	/**
	 * Head bet bet.
	 *
	 * @return the bet
	 */
	@RequestMapping(method = RequestMethod.HEAD, value = "/")
	@ResponseStatus(HttpStatus.OK)
	public Bet headBet() {
		
		for (Bet item : repository.getBets()) {
			LOGGER.info("The following Bets reported to user {}", item.getBetIdTeamA());	
			return item;
			}
		return null;
		


	}

	/**
	 * Delete bet int.
	 *
	 * @param id the id
	 * @return the long
	 */
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public long deleteBet(@PathVariable final long id) {
		return id;
	}
}

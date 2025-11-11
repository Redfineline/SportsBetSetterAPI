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

package org.frankthebookie.api.services.bet.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

import org.frankthebookie.api.services.bet.model.Bet;
import org.springframework.stereotype.Repository;

@Repository
public class BetRepository {

	private Map<UUID, Bet> bets = new HashMap<>();

	public Optional<Bet> findById(UUID id) {
		return Optional.ofNullable(bets.get(id));
	}

	public void add(Bet bet) {
		bets.put(bet.getGameId(), bet);
	}

	public Collection<Bet> getBets() {
		return bets.values();
	}
}

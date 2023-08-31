package it.corradolombardi.refereeassistant.rs.v1;

import it.corradolombardi.refereeassistant.core.Match;
import it.corradolombardi.refereeassistant.core.MatchIdentifier;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchesRepository extends PagingAndSortingRepository<Match, MatchIdentifier> {
}

package v2;

import java.util.ArrayList;
import java.util.List;

public class SimpleMatchweekCreator implements IMatchweekCreator{
	
	@Override
	public Matchweek createMatchweek(List<Team> teams, String name) {
		// TODO Auto-generated method stub
		List<Match> matches = new ArrayList<>();
		
		for(int i = 0; i < teams.size(); i += 2)
			matches.add(new Match(teams.get(i),teams.get(i+1)));
		
		return new Matchweek(name,matches);
	}

	
	
}

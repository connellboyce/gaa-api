package com.connellboyce.gaa_api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fixture {
	private String home;
	private String away;
	private String date;
	private String homeScore;
	private String awayScore;
	private String competition;
	private String venue;
	private String referee;
}

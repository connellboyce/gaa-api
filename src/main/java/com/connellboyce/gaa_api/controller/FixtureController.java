package com.connellboyce.gaa_api.controller;

import com.connellboyce.gaa_api.model.Fixture;
import com.connellboyce.gaa_api.payload.response.GetFixturesResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/fixtures")
public class FixtureController {

	@GetMapping
	public ResponseEntity<?> getUpcomingFixtures() {
		return ResponseEntity.ok(new GetFixturesResponse(List.of(new Fixture("US GAA", "New York", "12 July", "2-05", "1-03", "GAA Football All-Ireland Junior Championship", "Abbottstown - GAA Centre of Excellence", "Niall Quinn"))));
	}

	@GetMapping("/{county}")
	public ResponseEntity<?> getUpcomingFixturesByCounty(@PathVariable("county") String county) {
		return ResponseEntity.ok(new GetFixturesResponse(List.of(new Fixture(county, county.equalsIgnoreCase("donegal") ? "Galway" : "Donegal", "06 July", "2-05", "1-03", "GAA Football All-Ireland Senior Championship", "Páirc an Chrócaigh", "Niall Quinn"))));
	}
}

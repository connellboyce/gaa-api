package com.connellboyce.gaa_api.payload.response;

import com.connellboyce.gaa_api.model.Fixture;
import lombok.Getter;

import java.util.List;

@Getter
public class GetFixturesResponse {
	private final List<Fixture> fixtures;
	public GetFixturesResponse(List<Fixture> fixtures) {
		this.fixtures = fixtures;
	}
}

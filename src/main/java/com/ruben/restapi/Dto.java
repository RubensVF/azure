package com.ruben.restapi;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Dto
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Dto {
 
	private String id;

	private String name;
	 
}

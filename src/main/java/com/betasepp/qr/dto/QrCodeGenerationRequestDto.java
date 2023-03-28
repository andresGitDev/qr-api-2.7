package com.betasepp.qr.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@JacksonStdImpl
@NoArgsConstructor
@AllArgsConstructor
public class QrCodeGenerationRequestDto {

	@Schema(description = "Title of your message", required = true, example = "Important message")
	@NotBlank(message = "title must not be empty")
	@Size(max = 50, message = "Title should not exceed more than 50 characters")
	private String title;

	@Schema(description = "Message you want to decode", required = true, example = "Drink water")
	@NotBlank(message = "message must not be empty")
	@Size(max = 5000, message = "message should not exceed more than 5000 characters")
	private String message;

	@Schema(description = "Name of person generating the QR code ", required = true, example = "Mayur Ingle")
	@NotBlank(message = "generated-by-name must not be empty")
	private String generatedByName;

	@Schema(description = "Data to generate", required = true, example = "https://www.afip.gob.ar/fe/qr/?p=eyJ2ZXIiOjEsImZlY2hhIjoiMjAyMy0wMy0wMSIsImN1aXQiOjIwMjAyNTEyOTE4LCJwdG9WdGEiOiAzLCJ0aXBvQ21wIjogMSwibnJvQ21wIjoxNDk1LCJpbXBvcnRlIjoxNDkxMzMuMzMsIm1vbmVkYSI6IlBFUyIsImN0eiI6MS4wMCwidGlwb0RvY1JlYyI6ODAsIm5yb0RvY1JlYyI6MzA2NDc2MDQxMjUsInRpcG9Db2RBdXQiOiJFIiwiY29kQXV0Ijo3MzA5ODk1MTE3NTk0NH0=")
	@NotBlank(message = "data must not be empty")
	private String data;

}

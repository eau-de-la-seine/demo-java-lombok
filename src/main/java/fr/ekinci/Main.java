package fr.ekinci;

import lombok.*;
import lombok.extern.java.Log;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/**
 * Generated: {@link Data}, {@link Getter}, {@link Setter}, {@link EqualsAndHashCode}, {@link ToString}
 * Inference: {@link val}
 * Patterns : {@link Builder}, {@link Value}
 * Loggers  : {@link lombok.extern.java.Log}, {@link lombok.extern.slf4j.Slf4j}, {@link lombok.extern.log4j.Log4j}
 * Cleaning Resources/Exceptions: {@link Cleanup}, {@link NonNull}, {@link SneakyThrows}
 *
 * @author Gokan EKINCI
 */
@Log
public class Main {
	public static void main(String[] args) {
		log.fine("Hello !");
	}

	/**
	 * Builder pattern
	 */
	public static void builder() {
		val b = fr.ekinci.examples.pattern.builder.MyClass
			.builder()
			.attribute1("A")
			.attribute2("B")
			.attribute3("C")
			.build();
	}

	/**
	 * Immutable pattern
	 *
	 * Existing immutable class examples:
	 * {@link java.lang.String}
	 * {@link java.math.BigInteger}
	 * {@link java.math.BigDecimal}
	 */
	public static void immutable() {
		val i = new fr.ekinci.examples.pattern.immutable.MyClass("A");

		i.getAttribute1();
	}

	/**
	 * Non null parameters with Lombok
	 * @param param1
	 * @param param2
	 */
	public static void nonNullParameters_lombok(@NonNull Object param1, @NonNull Object param2) {

	}

	/**
	 * Non null parameters with Java
	 * @param param1
	 * @param param2
	 */
	public static void nonNullParameters_java(Object param1, Object param2) {
		Objects.requireNonNull(param1, "param1");
		Objects.requireNonNull(param2, "param2");
	}

	/**
	 * Resource cleaning with Lombok (useful for Java 6 and previous versions)
	 */
	public static void resourceCleaning_lombok() throws IOException {
		@Cleanup val inputStream = new ByteArrayInputStream(new byte[0]);
		int result = inputStream.read();
	}

	/**
	 * Resource cleaning with Java try-with-resources (since Java 7)
	 */
	public static void resourceCleaning_java() throws IOException {
		try (InputStream inputStream = new ByteArrayInputStream(new byte[0])) {
			int result = inputStream.read();
		}
	}

	/**
	 * Non checked exceptions
	 */
	@SneakyThrows
	private static void nonCheckedExceptions() {
		throw new Exception();
	}
}
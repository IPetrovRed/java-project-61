run-dist:
	./build/install/app/bin/app

run:
	./gradlew run

clean:
	./gradlew clean

build:
	./gradlew clean build

install:
	./gradlew clean install

lint:
	./gradlew checkstyleMain

check-deps:
	./gradlew dependencyUpdates -Drevision=release

build-run: build run

.PHONY: build
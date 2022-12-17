jarBuild:
	./gradlew -x test build

run-local:
	java -jar build/libs/application.jar --spring.profiles.active=jong

run-aws:
	java -jar build/libs/application.jar --spring.profiles.active=aws &


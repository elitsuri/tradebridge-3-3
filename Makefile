.PHONY: all clean docker-up docker-down

all:
	@echo "Build target for this project"

docker-up:
	docker compose up --build -d

docker-down:
	docker compose down

clean:
	@echo "Clean target for this project"

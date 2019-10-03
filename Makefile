.PHONY: help

help: ## This help.
	@awk 'BEGIN {FS = ":.*?## "} /^[a-zA-Z_-]+:.*?## / {printf "\033[36m%-30s\033[0m %s\n", $$1, $$2}' $(MAKEFILE_LIST)

.DEFAULT_GOAL := help

setup: ## Install requirements
	pip3 install -r requirements-dev.txt --user
	pip3 install -r requirements.txt --user

generate-docs: ## Generate documentation
	sbt "doc-generator/run"

run: ## Run application
	python3 src/codacy_pylint.py

test: ## Run unit tests
	green src

build: ## Build container
	docker build -t codacy-pylint-python3:latest .

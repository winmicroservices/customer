# [4.0.0](https://github.com/winmicroservices/customer/compare/v3.1.0...v4.0.0) (2023-01-12)


### Bug Fixes

* [#35](https://github.com/winmicroservices/customer/issues/35) Added the group-id back in. ([1319e94](https://github.com/winmicroservices/customer/commit/1319e9495e87ea40d8ed09505571b197cdb168c8))
* [#35](https://github.com/winmicroservices/customer/issues/35) Adding javadocs. ([12121c7](https://github.com/winmicroservices/customer/commit/12121c718afc323d67494d9f1e9023e22f62b294))
* [#35](https://github.com/winmicroservices/customer/issues/35) Adding test for utils. ([6dc8cee](https://github.com/winmicroservices/customer/commit/6dc8ceef012ed51e76e0955e93af8393cf73d67e))
* [#35](https://github.com/winmicroservices/customer/issues/35) Adding Util class for reusable methods. ([6ae836c](https://github.com/winmicroservices/customer/commit/6ae836c25bd8205ff85e52280ddf26697e960132))
* [#35](https://github.com/winmicroservices/customer/issues/35) Assert the payload is not null. ([b7752f2](https://github.com/winmicroservices/customer/commit/b7752f247feada8e4422255bf2cce24b0186b840))
* [#35](https://github.com/winmicroservices/customer/issues/35) Change the Kafka test port to 9092. ([8f92b37](https://github.com/winmicroservices/customer/commit/8f92b37c99a20651e5d1542abcb0684a9d667237))
* [#35](https://github.com/winmicroservices/customer/issues/35) Changing the docker image name from demo to customer. ([21dad1a](https://github.com/winmicroservices/customer/commit/21dad1acc4197fc939407cb6a2d1b4d0aa4d7675))
* [#35](https://github.com/winmicroservices/customer/issues/35) Format class. ([c1d9808](https://github.com/winmicroservices/customer/commit/c1d98089acc94de1796596d9a0b09dcaf93b3085))
* [#35](https://github.com/winmicroservices/customer/issues/35) Parse the result of the payload for comparison. ([0c5512c](https://github.com/winmicroservices/customer/commit/0c5512cdae1d73061089d517f5ca35ab5d843c5c))
* [#35](https://github.com/winmicroservices/customer/issues/35) Refactoring the kafka topic message to the service. ([375edc1](https://github.com/winmicroservices/customer/commit/375edc158d0f0317459a55059b49e7a4356a8b19))
* [#35](https://github.com/winmicroservices/customer/issues/35) Testing the kafka consumer. ([40f81c1](https://github.com/winmicroservices/customer/commit/40f81c1175e315c53e359f195efd3c2d87e72499))
* [#35](https://github.com/winmicroservices/customer/issues/35) The Kafka tests are starting to work. ([9bb9caa](https://github.com/winmicroservices/customer/commit/9bb9caa2f8a64fd652edf8ac7da10221c3facd53))
* [#35](https://github.com/winmicroservices/customer/issues/35) Updating test properites. ([0446995](https://github.com/winmicroservices/customer/commit/0446995321c1fb701307483eca02ba461ed81d2a))
* Introduce the CQRS pattern. [#35](https://github.com/winmicroservices/customer/issues/35). ([5a9194f](https://github.com/winmicroservices/customer/commit/5a9194fc535b58d2de52fe104bf2c81a9f8893b3))
* **KafkaConsumer:** [#35](https://github.com/winmicroservices/customer/issues/35) Removing dead code. ([80eefc9](https://github.com/winmicroservices/customer/commit/80eefc9ac82a31c375f8cbab44ea018a9b29205e))
* **KafkaConsumer:** [#35](https://github.com/winmicroservices/customer/issues/35) Removing more dead code. ([9cee970](https://github.com/winmicroservices/customer/commit/9cee9704e6a6449c95944d11f647d7dbe7c3bb1a))


### Features

* **cqrs:** [#35](https://github.com/winmicroservices/customer/issues/35) Adding state info for the events emitted to Kafka for state changes, CREATED, UPDATED, DELETED. ([adfe2ba](https://github.com/winmicroservices/customer/commit/adfe2ba088605f251817ae203ddb6b172b43704b))
* **Kafka:** [#35](https://github.com/winmicroservices/customer/issues/35) Working on Kafka tests. ([82c19f7](https://github.com/winmicroservices/customer/commit/82c19f765dbf61014e03c9921c08751b828f3d85))


### BREAKING CHANGES

* Changing the docker image name from demo to customer.
* Change the main app name.



# [3.1.0](https://github.com/winmicroservices/customer/compare/v3.0.0...v3.1.0) (2023-01-11)


### Bug Fixes

* [#27](https://github.com/winmicroservices/customer/issues/27) Adding Kafka libraries. ([ade2824](https://github.com/winmicroservices/customer/commit/ade28246a4623a1ffd89c55d67c5f1336614d5d5))
* [#27](https://github.com/winmicroservices/customer/issues/27) Adding kafka properties for tests. ([adb8554](https://github.com/winmicroservices/customer/commit/adb8554aed4419bd484cc52105784c82e6af5a70))
* [#27](https://github.com/winmicroservices/customer/issues/27) Kafka is working with docker-compose. ([85179f2](https://github.com/winmicroservices/customer/commit/85179f2567ff0244e25c55fa34e3e77cba3163f6))


### Features

* [#27](https://github.com/winmicroservices/customer/issues/27) Adding EmbeddedKafka for testing. ([cc5d125](https://github.com/winmicroservices/customer/commit/cc5d125fa39daada3b023e9953b71a1b58f1b494))
* [#27](https://github.com/winmicroservices/customer/issues/27) Adding kafka viewer to the docker-compose. ([a4ff2e1](https://github.com/winmicroservices/customer/commit/a4ff2e1096b609c09409da284061cb637f784a34))
* Add Kafka for events [#27](https://github.com/winmicroservices/customer/issues/27) ([cdb795d](https://github.com/winmicroservices/customer/commit/cdb795deae89e19dea3baabcadc875bfa02d872c))



# [3.0.0](https://github.com/winmicroservices/customer/compare/v2.2.2...v3.0.0) (2023-01-06)


### Bug Fixes

* Test out conventional commits. [#32](https://github.com/winmicroservices/customer/issues/32) ([47c2dfe](https://github.com/winmicroservices/customer/commit/47c2dfe76ebb53afc4cc0915306d94a248bf17a2))


### Features

* [#32](https://github.com/winmicroservices/customer/issues/32) Removing the test coverage report to the PR. ([410c44c](https://github.com/winmicroservices/customer/commit/410c44c7bcddbea1fb3f79d22f40b03a83509495))


### BREAKING CHANGES

* This is a breaking change.



## [2.2.2](https://github.com/winmicroservices/customer/compare/v2.2.1...v2.2.2) (2023-01-06)


### Bug Fixes

* [#29](https://github.com/winmicroservices/customer/issues/29) Adding link to hatoes article in the readme. ([2a391b8](https://github.com/winmicroservices/customer/commit/2a391b88e9139b60689ba823708dcb154839539e))
* [#29](https://github.com/winmicroservices/customer/issues/29) Adding search and sort example. ([87a9cc3](https://github.com/winmicroservices/customer/commit/87a9cc353557fd51a50d34bb6018daca82811086))
* Publish Jacoco reports. [#29](https://github.com/winmicroservices/customer/issues/29) ([2c67ec0](https://github.com/winmicroservices/customer/commit/2c67ec0e74f395c4645c1145f43fe205b9689cbd))
* Publish Jacoco reports. [#29](https://github.com/winmicroservices/customer/issues/29).  Put the path in quotes. ([c85ba53](https://github.com/winmicroservices/customer/commit/c85ba53dbe08cc59139a488ebf9b1ee5caa22086))
* Publish Jacoco reports. [#29](https://github.com/winmicroservices/customer/issues/29).  Updating the readme to reflect changes in the api. ([e749930](https://github.com/winmicroservices/customer/commit/e749930c69637f96245340dd678c30ea09389d64))



## [2.2.1](https://github.com/winmicroservices/customer/compare/v2.2.0...v2.2.1) (2023-01-05)


### Bug Fixes

*  [#28](https://github.com/winmicroservices/customer/issues/28) Adding lastname field. ([57accef](https://github.com/winmicroservices/customer/commit/57accef5efd5dcc002548a6703c91be1942287ad))
*  [#28](https://github.com/winmicroservices/customer/issues/28) API links have changed. ([32c3940](https://github.com/winmicroservices/customer/commit/32c3940deff572757e23e3f5b0a4fdacd1a2978b))
*  [#28](https://github.com/winmicroservices/customer/issues/28) Updating readme to reflect change to customer model. ([f06ef1c](https://github.com/winmicroservices/customer/commit/f06ef1c8442713b517852a7fc913058dc18bb40f))
* [#28](https://github.com/winmicroservices/customer/issues/28) Adding links to customers apis. ([e5361a1](https://github.com/winmicroservices/customer/commit/e5361a1853c963709945ecb71a581148c5a594b4))
* [#28](https://github.com/winmicroservices/customer/issues/28) Removed the customerId. ([fb85f8a](https://github.com/winmicroservices/customer/commit/fb85f8a1d6fbaa479327a01c427b27088dc75404))
* [#28](https://github.com/winmicroservices/customer/issues/28) Set the app to update the db only. ([97040cc](https://github.com/winmicroservices/customer/commit/97040ccd6cfac56a2512518dc8c8c1ba00639a0e))
* [#28](https://github.com/winmicroservices/customer/issues/28) The create customer is working. ([617037d](https://github.com/winmicroservices/customer/commit/617037d55cc9c908647c030ed7be9c489da4c9ab))
* [#28](https://github.com/winmicroservices/customer/issues/28) The self link was added to the link in the list. ([36fef94](https://github.com/winmicroservices/customer/commit/36fef94232a9f483318531a69835417b33b87bbf))
* [#28](https://github.com/winmicroservices/customer/issues/28) Use the link for v4. ([baf022c](https://github.com/winmicroservices/customer/commit/baf022cfe280fa05ec1b53a1aee5a254ec71ca1c))
* [#28](https://github.com/winmicroservices/customer/issues/28) Working on the hatoes links. ([758a2db](https://github.com/winmicroservices/customer/commit/758a2db5469bac20c0fa3f83a82cc509adfb2f6f))




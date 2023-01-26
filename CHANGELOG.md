# [7.0.0](https://github.com/winmicroservices/customer/compare/v6.0.0...v7.0.0) (2023-01-26)


### Bug Fixes

* [#41](https://github.com/winmicroservices/customer/issues/41) Updating tests to accomodate the changes to the context path. ([234c8eb](https://github.com/winmicroservices/customer/commit/234c8eba306dc5f2d90ed8baf0c67084181983e6))
* **api:** Demo follow up items [#41](https://github.com/winmicroservices/customer/issues/41).  Changing the url patterns to have a a base of /customer ([41faa79](https://github.com/winmicroservices/customer/commit/41faa7966d68ce772436de92b503b19ef57bc9d0))


### Features

* [#41](https://github.com/winmicroservices/customer/issues/41) Adding swagger API. ([8cbfbbe](https://github.com/winmicroservices/customer/commit/8cbfbbed07e4be660a114ea02e0b2153eaa39068))


### BREAKING CHANGES

* **api:** Changing the url pattern



# [6.0.0](https://github.com/winmicroservices/customer/compare/v5.0.0...v6.0.0) (2023-01-20)


### Bug Fixes

* [#39](https://github.com/winmicroservices/customer/issues/39) Organizing imports. ([908bf71](https://github.com/winmicroservices/customer/commit/908bf71d4962c380030c9c9fd5109f9234a59a05))
* **pom:** [#39](https://github.com/winmicroservices/customer/issues/39) Changing artifact id. ([d97ca2a](https://github.com/winmicroservices/customer/commit/d97ca2a7acc9f2b387225488c7ac13b188d7d391))


### Features

* [#39](https://github.com/winmicroservices/customer/issues/39) Adding index to the msg_sent column on the event table. ([8854fa1](https://github.com/winmicroservices/customer/commit/8854fa1633b5ad9c22a57eae11267b432aac7457))
* Add database indexes. [#39](https://github.com/winmicroservices/customer/issues/39) ([debca68](https://github.com/winmicroservices/customer/commit/debca68ad0df9290e64cfabb7fae69697b4008ae))


### BREAKING CHANGES

* **pom:** Changing the artifact id.



# [5.0.0](https://github.com/winmicroservices/customer/compare/v4.0.0...v5.0.0) (2023-01-19)


### Bug Fixes

* [#37](https://github.com/winmicroservices/customer/issues/37) Adding the forgein key to the customer_event table. ([e1a8685](https://github.com/winmicroservices/customer/commit/e1a8685c9ec6a822aeb6d8cb7674bf9a958bde75))
* [#37](https://github.com/winmicroservices/customer/issues/37) Changed the MVC test name to RestContollerTest.  Added a more complex HATEOS test. ([70a7af7](https://github.com/winmicroservices/customer/commit/70a7af71baa38b987328812cbcea2fd7f74f1fd3))
* [#37](https://github.com/winmicroservices/customer/issues/37) Made the kafka test simpler. ([4b03d38](https://github.com/winmicroservices/customer/commit/4b03d385e263cc74ff067ee3ff95600c3ba62530))
* [#37](https://github.com/winmicroservices/customer/issues/37) Remove the kafka test for now. ([3dfe6bd](https://github.com/winmicroservices/customer/commit/3dfe6bda8edbdbcf5025740c30e8b550c864f5a4))
* [#37](https://github.com/winmicroservices/customer/issues/37) Removed the cascade on persist. ([7c9c3ba](https://github.com/winmicroservices/customer/commit/7c9c3baefa815f6b0fc9b1a354bffde70b6f5d91))
* [#37](https://github.com/winmicroservices/customer/issues/37) Removing a commented out section. ([584cb9e](https://github.com/winmicroservices/customer/commit/584cb9efe08e88fefdaac73a659dd4854d56436d))
* [#37](https://github.com/winmicroservices/customer/issues/37) Renaming customer_history table to customer_event table. ([0a47e66](https://github.com/winmicroservices/customer/commit/0a47e661a0ee09474c70725fd1b3bf65bb1170ea))
* [#37](https://github.com/winmicroservices/customer/issues/37) Try the Slf4j logger. ([0d9474d](https://github.com/winmicroservices/customer/commit/0d9474d6c4795c5cf0327cf2a6ebcac41522bb5e))
* Add a delete service.  Refactor the event repository name. ([f511806](https://github.com/winmicroservices/customer/commit/f511806eb8d46785bc79ee730ea87658ff49192e))


### Features

* [#37](https://github.com/winmicroservices/customer/issues/37) Added update api test. ([fe21b13](https://github.com/winmicroservices/customer/commit/fe21b13a9441bd92b5a161ae5fa3687609fb9c10))
* [#37](https://github.com/winmicroservices/customer/issues/37) Adding a delete test. ([f1ee634](https://github.com/winmicroservices/customer/commit/f1ee634d11943592d9f52f51fa55ad121ddcd91f))
* [#37](https://github.com/winmicroservices/customer/issues/37) The update should check to see if the customer exists before updating. ([89c55e1](https://github.com/winmicroservices/customer/commit/89c55e19cb76da15a8fa0119c2015994d80da0b0))
* **delete:** [#37](https://github.com/winmicroservices/customer/issues/37) Adding delete API. ([0a426b7](https://github.com/winmicroservices/customer/commit/0a426b77261ab617fd4169cf038bd9937bff6520))
* **health:** Add CQRS to updates and deletes [#37](https://github.com/winmicroservices/customer/issues/37).  Adding Springboot actuator health check. ([26f71a3](https://github.com/winmicroservices/customer/commit/26f71a3593e8eae3914fe0d9e2f6f52e55d1bbcc))
* **history:** [#37](https://github.com/winmicroservices/customer/issues/37) Adding CustomerHistory and supporting table. ([4ed5b23](https://github.com/winmicroservices/customer/commit/4ed5b235f43a069852e2e513a40d6cdb64d4a236))
* **model:** [#37](https://github.com/winmicroservices/customer/issues/37) Changing to a generic model. ([f598ebd](https://github.com/winmicroservices/customer/commit/f598ebdb47db4dba0a9586d639313d2b7af0bb49))
* **model:** [#37](https://github.com/winmicroservices/customer/issues/37) Ignoring the id when running the jackson mashler. ([a27ac83](https://github.com/winmicroservices/customer/commit/a27ac832f75ec3b3be9aacae49c8cc8dfdb4f69b))


### BREAKING CHANGES

* **model:** Changing the db schema.



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




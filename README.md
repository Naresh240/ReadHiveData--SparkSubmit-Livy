Spark Submit command:
---------------------
spark-submit --master yarn --jars /usr/lib/hadoop-lzo/lib/:/usr/lib/hadoop/hadoop-aws.jar:/usr/share/aws/aws-java-sdk/:/usr/share/aws/emr/emrfs/conf:/usr/share/aws/emr/emrfs/lib/:/usr/share/aws/emr/emrfs/auxlib/:/usr/share/aws/emr/security/lib/* --conf spark.executor.memory=4g --conf spark.executor.cores=2 --conf spark.executor.instances=12 --conf spark.sql.warehouse.dir=/home/hadoop --class org.example.ReadHiveData /home/hadoop/apachesparkmysqllivy-1.0-SNAPSHOT-jar-with-dependencies.jar

curl command:
-------------
curl -H "Content-Type: application/json" -X POST --data '{"className": "org.example.ReadHiveData","file": "s3://mysql-data-jar-bucket/apachesparkmysqllivy-1.0-SNAPSHOT-jar-with-dependencies.jar"}' -i :8998/batches

Checking for livy state Starting:
---------------------------------
curl http://:8998/batches

check logs for livy:
--------------------
curl http://:8998/batches/0/logs

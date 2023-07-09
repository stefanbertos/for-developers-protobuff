# for-developers-protobuff

python -m pip install grpcio
$ python -m pip install grpcio-tools

in python folder
python -m grpc_tools.protoc -I../src/main/proto --python_out=. --pyi_out=. --grpc_python_out=. ../src/main/proto/order.proto

python order_client.py
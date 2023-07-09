from google.protobuf.internal import containers as _containers
from google.protobuf.internal import enum_type_wrapper as _enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Iterable as _Iterable, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class Status(int, metaclass=_enum_type_wrapper.EnumTypeWrapper):
    __slots__ = []
    CREATED: _ClassVar[Status]
    DONE: _ClassVar[Status]
    CANCELED: _ClassVar[Status]
    RETURNED: _ClassVar[Status]
CREATED: Status
DONE: Status
CANCELED: Status
RETURNED: Status

class CreateOrderRequest(_message.Message):
    __slots__ = ["userId", "products"]
    USERID_FIELD_NUMBER: _ClassVar[int]
    PRODUCTS_FIELD_NUMBER: _ClassVar[int]
    userId: str
    products: _containers.RepeatedCompositeFieldContainer[Product]
    def __init__(self, userId: _Optional[str] = ..., products: _Optional[_Iterable[_Union[Product, _Mapping]]] = ...) -> None: ...

class CreateOrderResponse(_message.Message):
    __slots__ = ["id", "status"]
    ID_FIELD_NUMBER: _ClassVar[int]
    STATUS_FIELD_NUMBER: _ClassVar[int]
    id: int
    status: Status
    def __init__(self, id: _Optional[int] = ..., status: _Optional[_Union[Status, str]] = ...) -> None: ...

class Product(_message.Message):
    __slots__ = ["id", "name", "description", "price"]
    ID_FIELD_NUMBER: _ClassVar[int]
    NAME_FIELD_NUMBER: _ClassVar[int]
    DESCRIPTION_FIELD_NUMBER: _ClassVar[int]
    PRICE_FIELD_NUMBER: _ClassVar[int]
    id: int
    name: str
    description: str
    price: float
    def __init__(self, id: _Optional[int] = ..., name: _Optional[str] = ..., description: _Optional[str] = ..., price: _Optional[float] = ...) -> None: ...

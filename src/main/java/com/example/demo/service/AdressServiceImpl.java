package com.example.demo.service;

import com.example.tutorial.protos.AddressBook;
import com.example.tutorial.protos.AdressServiceGrpc;
import com.example.tutorial.protos.Person;
import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class AdressServiceImpl extends AdressServiceGrpc.AdressServiceImplBase {
    @Override
    public void list(Empty request, StreamObserver<AddressBook> responseObserver) {
        var phone = Person.PhoneNumber.newBuilder();
        phone.setNumber("123456").setType(Person.PhoneType.MOBILE);

        var person = Person.newBuilder();
        person.setEmail("stefan.bertos@gmail.com").setId(1).setName("Stefan").addPhones(phone);


        AddressBook response = AddressBook.newBuilder()
                .addPeople(person)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}

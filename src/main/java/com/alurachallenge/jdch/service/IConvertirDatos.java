package com.alurachallenge.jdch.service;

import java.util.List;

public interface IConvertirDatos {
    <T> T obtenerListaDatos(String json, Class<T> clase);
}
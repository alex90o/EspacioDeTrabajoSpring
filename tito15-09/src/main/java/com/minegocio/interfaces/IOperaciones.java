package com.minegocio.interfaces;

import com.minegocio.VO.ClienteVO;

public interface IOperaciones {
	void insertar(ClienteVO c);
	void buscarCliente(int dni);
	void modificar(ClienteVO c);
	void eliminar(int dni);
}
"""import matplotlib.pyplot as plt
import numpy as np

# Constantes
R = 0.0821  # atm * L / mol * K
Tc = 369.8  # K
Pc = 41.92  # atm

a = 0.45724 * (R ** 2 * Tc ** 2) / (Pc)  # (L^2 * atm) / mol^2
b = 0.07780 * (R * Tc) / (Pc)  # L / mol

T_values = np.arange(0, 400, 10)
T_values = 273 + T_values

Tr = T_values / Tc

ω = 0.152
m = 0.37464 + 1.54226 * ω - 0.26992 * ω ** 2
α = (1 + m * (1 - Tr * 0.5)) ** 2

# Crear un arreglo de valores de V
V_values = np.linspace(0.0001, 5, 10000)  # Rango de valores de V


def vdw(T, V):
    return (R * T) / (V - b) - (a * α) / (V ** 2 + 2 * b * V - b ** 2)


# Calcular la presión para cada valor de V y T

for T in T_values:
    P_values = []
    for V in V_values:
        P = vdw(T, V)
        P_values.append(P)
    P_values = np.array(P_values)

    # Graficar la isoterma
    plt.plot(V_values, P_values, label='T = {} K'.format(T))

plt.xlabel('Volumen (Litros)')
plt.ylabel('Presión (atm)')
plt.title('Isotermas para diferentes temperaturas')
plt.ylim([-40, 40])
plt.legend()
plt.grid(True)
plt.show()"""

import matplotlib.pyplot as plt
import numpy as np

# Constantes
R = 0.0821  # atm * L / mol * K
Tc = 369.8  # K
Pc = 41.92  # atm

a = 0.45724 * (R ** 2 * Tc ** 2) / (Pc)  # (L^2 * atm) / mol^2
b = 0.07780 * (R * Tc) / (Pc)  # L / mol

ω = 0.152
m = 0.37464 + 1.54226 * ω - 0.26992 * ω ** 2

# Crear un arreglo de valores de T
T_values = np.arange(0, 400, 50)  # Rango de valores de T
T_values = 273 + T_values  # Convertir de °C a K

# Crear un arreglo de valores de V
V_values = np.linspace(0.0001, 5, 10000)  # Rango de valores de V

# Definir la función de Van der Waals
def vdw(T, V):
    Tr = T / Tc  # Calcular la temperatura reducida
    α = (1 + m * (1 - np.sqrt(Tr))) ** 2  # Calcular el factor de corrección
    return (R * T) / (V - b) - (a * α) / (V ** 2 + 2 * b * V - b ** 2)  # Calcular la presión

# Vectorizar la función para que pueda operar sobre arreglos
vdw = np.vectorize(vdw)

# Crear una malla de valores de T y V
T_mesh, V_mesh = np.meshgrid(T_values, V_values)

# Calcular la presión para cada punto de la malla
P_mesh = vdw(T_mesh, V_mesh)

# Crear una figura
fig = plt.figure()

# Crear un gráfico de contorno
ax = fig.add_subplot(111)
ax.contourf(T_mesh, V_mesh, P_mesh, cmap="jet")  # Usar un mapa de colores
ax.set_xlabel("Temperatura (K)")  # Etiquetar el eje x
ax.set_ylabel("Volumen (L/mol)")  # Etiquetar el eje y
ax.set_title("Ecuación de estado de Van der Waals")  # Agregar un título
fig.colorbar(ax.contourf(T_mesh, V_mesh, P_mesh, cmap="jet"))  # Agregar una barra de colores

# Crear una figura
fig = plt.figure()

# Crear un gráfico de superficie
ax = fig.add_subplot(111, projection="3d")
ax.plot_surface(T_mesh, V_mesh, P_mesh, cmap="jet")  # Usar un mapa de colores
ax.set_xlabel("Temperatura (K)")  # Etiquetar el eje x
ax.set_ylabel("Volumen (L/mol)")  # Etiquetar el eje y
ax.set_zlabel("Presión (atm)")  # Etiquetar el eje z
ax.set_title("Ecuación de estado de Van der Waals")  # Agregar un título
fig.colorbar(ax.plot_surface(T_mesh, V_mesh, P_mesh, cmap="jet"))  # Agregar una barra de colores

# Mostrar el gráfico
plt.show()
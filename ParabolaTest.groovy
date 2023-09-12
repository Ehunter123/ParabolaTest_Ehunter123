import eu.mihosoft.vrl.v3d.Parabola

return [ Parabola.extrudeByEquation(5,0.207,0,1)
	.move(100,0,0),
	Parabola.coneByEquation(5,1.107,0.7)
	.move(30,0,0),
	Parabola.coneByFocalLength(10, 10).move(50,0,0),
	Parabola.cone(10, 200), // smooth parabolic cone
	Parabola.cone(10, 60,3).movex(-30)// Pointy parabolic cone		
]
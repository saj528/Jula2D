#type vertex
#version 330 core
//any variable starting with a is an attribute
//these lines create two attributes
layout(location=0) in vec3 aPos;
layout(location=1) in vec4 aColor;

//passes fColor to fragment shader
// variables starting with f are for fragment shader
out vec4 fColor;

void main()
{
    fColor = aColor;
    //gl_position is always present and expected
    // vec4(aPos,1.0) creates a vec4 with the first three elements of aPos and
    //makes the final element 1.0
    gl_Position = vec4(aPos,1.0);
}

#type fragment
#version 330 core
//takes in the fColor from vertex shader
//variables must have in/out on both sides
in vec4 fColor;
out vec4 color;

void main()
{
    color = fColor;
}
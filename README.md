# video-annotator
A simple user-friendly Java application that can be used to extract images from a video and annotate the presence of objects and actions, as a data set for reinforcement learning. 

## Getting started (for users)
In the "running_programs" directory, you will find separate folders for Windows and Linux.

If you are a Windows user, just open "video-annotator-1.0.jar" file.
If you are a Linux user, make the above file executable under the file's properties and open it.
(P.S: JRE or JDK version 8 should be installed in your PC before running the application.)

In config.properties file, you can define the objects and the actions, before running the application. 
The first action you add will be the default action.

![Config](/running_programs/screenshots/1.png)

Then run the program. It will look like this.

![Config](/running_programs/screenshots/2.png)

The objects and the actions you have added will be loaded on the right hand side.

Click "Open" button to choose an MP4 video file. After it is loaded, choose a value for "Skip Frames". 
The default value is 0. If you set 0, all the frames of the video will be extracted. If you set 1, every second frame will be extracted, and so on.
After all the frames are extracted, the first frame will be displayed.

Instead of extracting images from a video, you can also copy your existing images to "images" folder. But they should be in "frame[number].jpg" format. E.g: frame1.jpg, frame2.jpg, ... After copying, click "Reload" button.

![Config](/running_programs/screenshots/3.png)

After that, you can select the objects and the actions that the current image contains and click next. Do the same for all the images. And then, save the changes under the file menu.

![Config](/running_programs/screenshots/4.png)

Finally, you will find a file named "output.csv" which shows the frame number, object presence (by 1 or 0), and the action.
You can feed the file to your RL algorithms.

![Config](/running_programs/screenshots/5.png)

## Getting started (for developers)
This is a Maven project. Build with dependencies and run. Using an IDE like NetBeans will make it easier for you.

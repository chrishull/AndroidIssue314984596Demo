# AndroidIssue314984596Demo

Dear Google QA

This is a demonstration of a bug I found in R8 involving subclassing LinearLayoutManager.  The issue I filed can be found here.

https://issuetracker.google.com/issues/314984596

To reproduce the bug do the following.

* Go to MainActivity and uncomment the layoutManager that is based on LinearLayoutManager.
* Build the project and run it in the simulator. Verify that it works.
* Build a signed APK and run it on a device. It should work.
* Go to MainActivity and uncomment the layoutManager that is based on SAOverscrollLLManagerTest.
* * Build the project and run it in the simulator. Verify that it works.
* Build a signed APK and run it on a device. It should throw an exception similar to the one I mention in the report.

Feel free to ask questions. I'm happy to help.

-Chris



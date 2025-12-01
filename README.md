# Ball-Fall-Problem-DSA🏀

The Ball Fall Problem was the last problem that I was able to successfully solve. In this problem, we had to simulate how balls would fall through a set of diagonal boards and analyze which column the balls exited.

I attempted to illegally brute force my way through this problem, which resulted in fail timeouts with really large constraints. After a bit of analysis, I realized the pattern of how each ball travelled through the grid of diagonal boards; I could improve my logic by simulating each ball independently while determining whether the left or right board was blocked.

The biggest challenge I faced while doing this was handling instances where the ball gets stuck in a “V” or “bowl” shape because I had to take great care when checking for valid boundaries and valid adjacent boards.

After a few iterations and extensive debugging on a few edge cases, I was able to create an efficient solution through a clean simulation method; it also had a time complexity of O(m × n). The final code has passed all test cases and was able to efficiently solve for many large input cases.

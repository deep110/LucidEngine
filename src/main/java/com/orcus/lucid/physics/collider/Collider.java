package com.orcus.lucid.physics.collider;

import com.orcus.lucid.physics.RigidBody;
import com.orcus.lucid.util.Vector2;

import java.awt.*;

/**
 * @author Deepankar Agrawal
 */
public abstract class Collider {

    public abstract void computeMass(RigidBody rigidBody, float density);

    public abstract void render(RigidBody rigidBody, Graphics2D gr, float renderScalingFactor);
}
